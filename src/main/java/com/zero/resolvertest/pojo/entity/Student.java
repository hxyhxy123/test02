package com.zero.resolvertest.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.pojo.entity
 * @Author: zero
 * @CreateTime: 2024-07-16  14:29
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;

    private String name;

    private String sex;

    private String teacher;
}
