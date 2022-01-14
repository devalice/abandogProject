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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="abandog_adopt_put_reply")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AbandogAdoptPutReply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="animal_adopt_put_reply", nullable=false)
	private int put_reply_num;
	@Column(name="put_reply_content", length=200, nullable=true)
	private String put_reply_content;
	@Column(name="inst_dtm", columnDefinition="datetime default CURRENT_TIMESTAMP")
	private Date inst_dtm;
	@Column(name="updt_dtm", columnDefinition="datetime")
	private Date updt_dtm;
	@Column(name="del_dtm", columnDefinition="datetime")
	private Date del_dtm;
	@Column(name="put_num",nullable=false)
	private int put_num;
	@Column(name="reply_writer", length=20, nullable=false)
	private String reply_writer;
}
