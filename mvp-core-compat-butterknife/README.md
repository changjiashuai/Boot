# Usage

    
## `mvp-core-compat-butterknife`

Add the dependency:
```Groovy
dependencies {
	compile 'com.changjiashuai.boot:mvp-core-compat-butterknife:1.0.0'
	compile 'com.jakewharton:butterknife:8.6.0'
	annotationProcessor 'com.jakewharton:butterknife-compiler:8.6.0'
}
```

## How to use this library

* Create Activity(Fragment) extends ButterKnifeActivity(BaseFragment) and initialize presenter in your Activity
```java
public class MainActivity extends ButterKnifeActivity<MainView, MainPresenter> implements MainView, MainFragment {

    private static final String TAG = "MainActivity";

    @Override
    public void initPresenter() {
        mPresenter = new MainPresenter();
    }

    @Override
    protected void initContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.btn_test)
    void onButtonClick() {
        Log.i(TAG, "onButtonClick: ");
        showMessage("test from activity");
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showRetry() {

    }

    @Override
    public void hideRetry() {

    }
}
```

## Let me know!

I'd be really happy if you sent me links to your projects where you use my component. Just send an email to changjiashuai@gmail.com And do let me know if you have any questions or suggestion regarding the libs. 


## License

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
    
