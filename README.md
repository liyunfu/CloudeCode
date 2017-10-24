# CloudeCode

## 扫描二维码，条形码


### 导入方式

#### 一.在项目gradle里添加

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

#### 二.

modle的gradle里添加

	dependencies {
	        compile 'com.github.liyunfu:CloudeCode:v1.0'
	}

### 使用方式

#### 一.添加回调接口

                ScanerCodeActivity.setScanerListener(new OnScanerListener() {
                    @Override
                    public void onSuccess(String s, Result result) {

                    }

                    @Override
                    public void onFail(String s, String s1) {

                    }
                });

#### 二.跳转Activity

                 startActivity(new Intent(MainActivity.this, ScanerCodeActivity.class));
