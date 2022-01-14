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
@Table(name="abandog_adopt_review")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbandogAdoptReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="review_num")
	private Integer review_num;
	@Column(name="review_title", length=50)
	private String review_title;
	@Column(name="review_writer", length=20, nullable=false)
	private String review_writer;
	@Column(name="review_content", length=500)
	private String review_content;
	@Column(name="review_file", length=100)
	private String review_file;
	@Column(name="review_count")
	private Date review_datetime;
	@Column(name="review_inst_dtm", nullable=false, columnDefinition="datetime default CURRENT_TIMESTAMP")
	private Date review_inst_dtm;
	@Column(name="review_updt_dtm", columnDefinition="datetime")
	private Date review_updt_dtm;
	@Column(name="review_del_dtm", columnDefinition="datetime")
	private Date review_del_dtm;
}
