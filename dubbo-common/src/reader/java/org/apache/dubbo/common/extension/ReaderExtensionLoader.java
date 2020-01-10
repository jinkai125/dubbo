package org.apache.dubbo.common.extension;

@SPI
public class ReaderExtensionLoader {

	public static void main(String[] args) {
		// ExtensionLoader入口
		ExtensionLoader<ReaderExtensionLoader> loader = ExtensionLoader.getExtensionLoader(ReaderExtensionLoader.class);
		// 添加扩展接口，此方法用于动态加载初始化
		loader.addExtension("", ReaderExtensionLoader.class);
	}
	
}
