package io.lihongbin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {

    private Integer code;

    private String msg;

    private Object data;

}
