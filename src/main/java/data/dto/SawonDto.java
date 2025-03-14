package data.dto;

/*
use studydb; 

create table sawondb 
(
	num smallint auto_increment primary key,
    sawonname varchar(20),
    photo varchar(50),
    gender varchar(10),
    hp varchar(20),
    buseo varchar(20),
    ipsaday varchar(20),
    writeday datetime
);
 */
import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("SawonDto")
public class SawonDto {
	private int num;
	private String sawonname;
	private String photo;
	private String gender;
	private String hp;
	private String buseo;
	private String ipsaday;
	private Timestamp writeday;
}
