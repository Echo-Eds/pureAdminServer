package com.li.Pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Li
 * @Description: TODO
 * @Date: 2023/9/28 13:28
 * @Version: 1.0
 */

@TableName("p_user")
@Data
public class User {
    @TableId(value = "p_id")
    private Integer pId;
    private String pName;
    private String pRole;
    private Integer pNumber;
}
