/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author am
 */
@Named(value = "bean")
@Dependent
public class Bean {
    //変更テスト//了解
    public void test(){}

    /**
     * Creates a new instance of Bean
     */
    public Bean() {
    }
    
}
