package com.luocj.pattern.lesson5;

import lombok.Builder;
import lombok.Data;

/**
 * @auth cj.luo
 * @date 2020/3/7
 */
@Data
@Builder
public class Menu {

    private String url;

    private String name;
}
