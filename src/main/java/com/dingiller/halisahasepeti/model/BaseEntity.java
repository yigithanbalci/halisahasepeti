package com.dingiller.halisahasepeti.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "halisahaSepetiSeqGen")
	@SequenceGenerator(name = "halisahaSepetiSeqGen", sequenceName = "halisahasepeti_sequence")
	private Long id;

	@CreatedBy
	private String createdBy;

	@CreatedDate
	private Date createdDate;

	@LastModifiedBy
	private String updatedBy;

	@LastModifiedDate
	private Date updatedDate;
}
