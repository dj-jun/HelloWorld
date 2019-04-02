# HelloWorld
## This is a HelloWorld Android Project.
## 步骤：先打开Android Studio，创建一个新项目，一直next就创建成功。
## 验证activity的生命周期
## 先在MainActivity.java中添加以下代码：
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"调用onCreate()");
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"调用onStart()");
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"调用onResume()");
    }
    
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"调用onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"调用onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"调用onStop()");
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"调用onDestroy()");
    }

## 然后保存，点击运行按钮：
## (1)程序开始运行时出现以下结果：
![](https://github.com/dj-jun/HelloWorld/blob/master/images/1.png)
## (2)程序在后台运行时出现以下结果：
![](https://github.com/dj-jun/HelloWorld/blob/master/images/2.png)
![](https://github.com/dj-jun/HelloWorld/blob/master/images/3.png)
## (3)程序退出时出现以下结果：
![](https://github.com/dj-jun/HelloWorld/blob/master/images/2.png)
![](https://github.com/dj-jun/HelloWorld/blob/master/images/4.png)

### 运行结果截图：
![](https://github.com/dj-jun/HelloWorld/blob/master/images/5.png)
