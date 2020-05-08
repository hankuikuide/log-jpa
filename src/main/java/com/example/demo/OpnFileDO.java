package com.example.demo;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @Description null
 * @Author  hkk
 * @Date 2019-06-20 
 */

@Builder
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@Entity
@Setter
@Getter
@Table ( name ="OPN_FILE" )
public class OpnFileDO  implements Serializable {


	/**
	 * id
	 */
	@Column(name = "ID" )
	@Id
	private String id;


}
