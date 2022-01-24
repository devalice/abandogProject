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
@Table(name="animal_list_reply")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbandogListReply extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="list_reply_num", nullable=false)
	private int list_reply_num;

	@Column(name="list_reply_content", length=200, nullable=true)
	private int list_reply_content;
	
	@Column(name="list_num", nullable=false)
	private int list_num;
	
	@Column(name="reply_writer", length=20, nullable=false)
	private String reply_writer;
}