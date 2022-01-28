package kr.co.abandog.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import kr.co.abandog.dto.AbandogDTO;
import kr.co.abandog.entity.Abandog;
import kr.co.abandog.repository.AbandogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class AbandogServiceImpl implements AbandogService {
	
	private final AbandogRepository abandogRepository;

	@Override
	public String abandogput(String json) {
		try{
			//JSON 파싱 객체 생성
			JSONParser jsonParser = new JSONParser();
			
			//JSON객체로 파서를 통해 저장
			JSONObject jsonObj = (JSONObject)jsonParser.parse(json);
			
			//데이터 분해
			JSONObject waitAbandog = (JSONObject) jsonObj.get("TbAdpWaitAnimalView");
			Long totalCnt = (Long) waitAbandog.get("list_total_count");
			
			System.out.println("유기견 수: " + totalCnt);
			
			JSONArray array = (JSONArray)waitAbandog.get("row");
			JSONObject jObj;
			for(int i=0; i<array.size(); i=i+1) {
				jObj = (JSONObject)array.get(i);
				AbandogDTO abandogDTO = new AbandogDTO();
				
				abandogDTO.setMember_email("openapi@naver.com"); //공공데이터 관리용 임시 아이디
				abandogDTO.setAnimal_no(jObj.get("ANIMAL_NO").toString());
				abandogDTO.setAbandog_name(jObj.get("NM").toString());
				abandogDTO.setAbandog_age(Integer.parseInt(jObj.get("AGE").toString().substring(0, jObj.get("AGE").toString().indexOf("("))));
				abandogDTO.setAban_dog_gender(jObj.get("SEXDSTN").toString());
				abandogDTO.setAbandog_date(jObj.get("ENTRNC_DATE").toString());
				
				switch(jObj.get("BREEDS").toString()) {
					case "닥스훈트":
						abandogDTO.setType_cd("D");
						break;
						
					case "말티즈":
						abandogDTO.setType_cd("Ma");
						break;
						
					case "요크셔테리어":
						abandogDTO.setType_cd("Y");
						break;
						
					case "푸들":
						abandogDTO.setType_cd("P");
						break;
						
					case "믹스":
						abandogDTO.setType_cd("Mi");
						break;
					
					default:
						abandogDTO.setType_cd("E");
						break;
				}
				abandogDTO.setState_cd(jObj.get("ADP_STTUS").toString()); //N(입양대기), P(입양진행중), C(입양완료)
				
				//DB저장
				Abandog abandog = dtoToEntity(abandogDTO);
				abandogRepository.save(abandog);
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		return "";
	}

}
