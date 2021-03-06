package com.baidu.rigel.rap.auto.generate.contract;

import com.baidu.rigel.rap.auto.generate.bo.GenerateUtils.GeneratorType;
import com.baidu.rigel.rap.auto.generate.bo.GenerateUtils.TargetObjectType;
import com.baidu.rigel.rap.project.bo.Project.StageType;

/**
 * generator interface, all generator class should
 * implement this interface
 * @author Bosn
 *
 */
public interface Generator {
	
	/**
	 * is available on specific stage
	 * @param stage
	 * @return
	 */
	boolean isAvailable(StageType stage);
	
	/**
	 * get generator type
	 * @return
	 */
	GeneratorType getGeneratorType();
	
	/**
	 * get author
	 * @return author
	 */
	String getAuthor();
	
	/**
	 * get introduction of generator
	 * @return
	 */
	String getIntroduction();
	
	/**
	 * get target object type
	 * @return
	 */
	TargetObjectType getTargetObjectType();
	
	/**
	 * this method will be invoked automatically 
	 * by RAP before using, the type of Object is
	 * decided by the return value of 
	 * getTargetObjectType() method, eg. if
	 * result PROJECT, RAP will pass the proper
	 * Project object automatically.
	 * @param project
	 */
	void setObject(Object obj);
	
	/**
	 * do generate
	 * @return generated result
	 */
	String doGenerate();
}
