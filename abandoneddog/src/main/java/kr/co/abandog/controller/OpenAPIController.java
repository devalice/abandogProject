package kr.co.abandog.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.abandog.service.AbandogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class OpenAPIController {
	
	private final AbandogService abandogService;
	
	@GetMapping("/calljsonapi")
	public String callopenAPIWithJSON() {
		
		//openAPI 요청
		StringBuffer result = new StringBuffer();
		try {
            String apiUrl = "http://openapi.seoul.go.kr:8088/"
            				+ "???/" //???에 자기가 발급받은 인증키 삽입
            				+ "json/"
            				+ "TbAdpWaitAnimalView/"
            				+ "1/"  //시작페이지
            				+ "22/"; //종료페이지
            
            URL url = new URL(apiUrl);
            
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            
            urlConnection.connect();
            
            BufferedInputStream bufferedInputStream = new BufferedInputStream(urlConnection.getInputStream());
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, "UTF-8"));
            
            String returnLine;
            
            while((returnLine = bufferedReader.readLine()) != null) {
                result.append(returnLine);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		//DB에 저장
		abandogService.abandogput(result.toString());
		
		return result.toString();
	}
}
