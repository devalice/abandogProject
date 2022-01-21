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
@Table(name="abandog_adopt_review_reply")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbandogAdoptReviewReply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="review_reply_num")
	private Integer review_reply_num;
	@Column(name="review_reply_writer", length=20, nullable=false)
	private String review_reply_writer;
	@Column(name="review_reply_content", length=500)
	private String review_reply_content;
	@Column(name="review_reply_inst_dtm", nullable=false, columnDefinition="datetime default CURRENT_TIMESTAMP")
	private Date review_reply_inst_dtm;
	@Column(name="review_reply_updt_dtm", columnDefinition="datetime")
	private Date review_reply_updt_dtm;
	@Column(name="review_reply_del_dtm", columnDefinition="datetime")
	private Date review_reply_del_dtm;
}
