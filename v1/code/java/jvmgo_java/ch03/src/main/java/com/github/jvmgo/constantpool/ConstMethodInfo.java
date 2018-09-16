package com.github.jvmgo.constantpool;

import com.github.jvmgo.clazz.ClassReader;

public class ConstMethodInfo implements ConstantInfo{
	private ConstantPool constPool;
	private int classIndex;
	private int nameAndTypeIndex;
	
	public ConstMethodInfo(ConstantPool aConstPool,ClassReader reader) {
		this.constPool = aConstPool;
		this.classIndex = reader.readUint16();
		this.nameAndTypeIndex = reader.readUint16();
		this.getValue();
	}

	@Override
	public String getValue() {
		return this.constPool.getUTF8(this.classIndex) 
				+ "." 
				+ this.constPool.getUTF8(this.nameAndTypeIndex);
	}
	
}
