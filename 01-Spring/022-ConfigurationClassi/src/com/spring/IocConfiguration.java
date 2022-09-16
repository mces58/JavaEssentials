package com.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// bundan onceki projelimizde hep xml dosyayi uzerinden islemler yapiyorduk
// configuration class'lar ile artik bunlara ihtiyac kalmiyor

@Configuration
// bu class'in bir configuration dosyasi olmasi icin yukarida ki annotation'i
// yazmaliyiz. Configuration dosyasi oldugu zaman artik context.xml dosyasina 
// gerek yok

@ComponentScan(basePackages = "com.spring")
// bunu xml dosyasinda da yapmistik class'lari tarar ve icinde component 
// iceren class'i calistirirdi kisacasi xml dosyasinda ki tarama islemini
// buraya tasidik
public class IocConfiguration {

}
