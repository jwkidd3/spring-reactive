/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author jwkidd3
 */
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Post {

  private UUID id;
  private String title;
  private String content;
}
