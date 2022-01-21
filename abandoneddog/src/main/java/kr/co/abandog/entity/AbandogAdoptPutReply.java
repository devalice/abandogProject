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
@Table(name="abandog_adopt_put_reply")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbandogAdoptPutReply extends BaseEntity{
	
		
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="abandog_adopt_put_reply", nullable=false)
private int put_reply_num;

@Column(name="put_reply_content", length=200, nullable=true)
private Date del_dtm;

@Column(name="put_num",nullable=false)
private int put_num;

@Column(name="reply_writer", length=20, nullable=false)
private String reply_writer;
	
}
