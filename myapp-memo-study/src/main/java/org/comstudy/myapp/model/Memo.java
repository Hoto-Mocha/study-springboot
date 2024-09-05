package org.comstudy.myapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@Setter
//@Getter
//@ToString
//위 3개를 합친 것이 @Data
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Memo {
	private int id;
	private String title;
	private String content;
}
