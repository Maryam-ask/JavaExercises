package com.askari.Lesson36_Annotation.MetaAnnotation.Inherited;

import java.lang.annotation.*;

/**
 * Created by Maryam Askari
 * Date: 4/19/2021
 * Time: 3:29 PM
 * Project: IntelliJ IDEA
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InheritedAnnotation {
}
