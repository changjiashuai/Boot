# Boot

[![License](http://img.shields.io/badge/license-MIT-green.svg?style=flat)]()
[](https://img.shields.io/github/issues/changjiashuai/Boot.svg)
[](https://img.shields.io/github/forks/changjiashuai/Boot.svg)
[](https://img.shields.io/github/stars/changjiashuai/Boot.svg)

Android Project Bootstrap.


##Requirements
- Android SDK 21+


##Usage

# `mvp-core`

Add the dependency:
```Groovy
dependencies {
	compile 'com.changjiashuai.boot:mvp-core:1.0.0'
}
```

## How to use this library

* Create view interface extends BaseView for your view
```java
public interface MainView extends BaseView {
}
```

* Create presenter extends BasePresenter need to impl attachView(V view) and detachView() or extends default SimplePresenter<V> not need to deal view attach and detach for your business logic with your view
```java
public class MainPresenter<V extends BaseView> implements BasePresenter<V> {

    protected V mView;

    @Override
    public void attachView(V view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
```
```java
public class MainPresenter extends SimplePresenter<MainView> {

}
```
* Create Activity(Fragment) extends BaseActivity(BaseFragment) and initialize presenter in your Activity
```java
public class MainActivity extends BaseActivity<MainView, MainPresenter>
        implements MainView {

    @Override
    public void initPresenter() {
        mPresenter = new MainPresenter();
    }
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
        
    ...
}
```
    


## Let me know!

We’d be really happy if you sent me links to your projects where you use our component. Just send an email to changjiashuai@gmail.com And do let me know if you have any questions or suggestion regarding the libs. 


##License

    The MIT License (MIT)

    Copyright © 2017 Changjiashuai

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
    
