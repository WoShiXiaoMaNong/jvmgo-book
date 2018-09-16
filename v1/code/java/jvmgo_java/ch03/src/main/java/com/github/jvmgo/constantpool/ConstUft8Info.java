package com.github.jvmgo.constantpool;

import com.github.jvmgo.clazz.ClassReader;

public class ConstUft8Info implements ConstantInfo{
	private ConstantPool constPool;
	private String value;
	
	public ConstUft8Info(ConstantPool aConstPool,ClassReader reader) {
		int length = reader.readUint16();
		byte[] bytes = reader.readByte(length);
		this.value = new String(bytes);
		this.constPool = aConstPool;
	}

	@Override
	public String getValue() {
		return this.value;
	}
	
}
