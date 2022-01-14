package kr.co.abandog.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="abandog_type_cd")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbandogTypeCD {
	
	@Id
	@Column(name="type_cd", length=1, columnDefinition = "char")
	private String type_cd;
	
	@Column(name="kinds", length=30, nullable= false)
	private String kinds;
	
	@Column(name="inst_dtm", columnDefinition = "datetime default CURRENT_TIMESTAMP")
	private Date inst_dtm;
	
	@Column(name="updt_dtm", columnDefinition = "datetime")
	private Date updt_dtm;
	
	@Column(name="del_dtm", columnDefinition = "datetime")
	private Date del_dtm;

}
