package kr.co.abandog.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="animal_list")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimalList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="list_num", nullable=false)
	private int list_num;
	
	@Column(name="list_title", length=50, nullable=false)
	private String list_title;
	
	@Column(name="list_content", length=500)
	private String list_content;
	
	@Column(name="list_file", length=200)
	private String list_file;
	
	@Column(name="list_count")
	private int list_count;
	
	@Column(name="list_datetime", columnDefinition="datetime")
	private Date list_datetime;
		
	@Column(name="isnt_dtm", nullable=false, columnDefinition="datetime default CURRENT_TIMESTAMP")
	private Date inst_dtm;
		
	@Column(name="updt_dtm", columnDefinition="datetime")
	private Date updt_dtm;
	
	@Column(name="del_dtm", columnDefinition="datetime")
	private Date del_dtm;
	
	@Column(name="list_writer", length=20, nullable=false)
	private String list_writer;
}
