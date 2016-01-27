package me.jarvischen.dagger;

import dagger.Module;

/**
 * Created by chenfuduo on 2016/1/26.
 */

//显示声明我们需要注入MyBaseActivity这个类
//Dagger包含一个annotation 处理器， 这个处理器检查module和注入的有效性。
// 处理器非常严格， 若是有任何绑定是无效或者不完整的， 将引发编译错误。
//此处标记DaggerDemoModule是不完整的

@Module(
        injects = MyBaseActivity.class,
        complete = false)

public class DaggerDemoModule {
}
