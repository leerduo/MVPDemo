package me.jarvischen.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by chenfuduo on 2016/1/26.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForApplication {

}
