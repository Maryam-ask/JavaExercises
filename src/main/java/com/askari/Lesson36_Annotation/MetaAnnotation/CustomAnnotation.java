package com.askari.Lesson36_Annotation.MetaAnnotation;

import java.lang.annotation.*;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 3:05 PM
 * Project: IntelliJ IDEA
 */

  // gharare Balasare che chizi estefade shavad.
    @Target({ElementType.METHOD, ElementType.TYPE})
  // Annotation chekari anjam dahad!!!  Moghe compile? Moghe Run-Time?
    @Retention(RetentionPolicy.RUNTIME)
  // Baraye neshon dadane usage in Annotation(CustomAnnotation) dar Java Doc
    @Documented
public @interface CustomAnnotation {
}
