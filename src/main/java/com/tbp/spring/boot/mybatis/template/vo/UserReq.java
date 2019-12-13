package com.tbp.spring.boot.mybatis.template.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * describe:
 *
 * @author mac 田北平
 * @date 2019/12/11 12:09
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserReq  implements Serializable {
    private Long id;

    @ApiModelProperty(name = "姓名",notes = "注意字符长度",example = "tianbeiping")
    private String name;

    private Byte sex;

    private String phone;

    private String address;

    private Integer refShopId;

}
