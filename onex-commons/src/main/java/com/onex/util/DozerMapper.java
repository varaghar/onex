/**
 * 
 */
package com.onex.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

/**
 * @author Alexandru.Sabou
 *
 */
public class DozerMapper extends DozerBeanMapper{

	public <T, U> List<T> mapListObject(final List<U> inputList, final Class<T> destinationClass) {
		List<T> resultList = new ArrayList<>();
		for(U element : inputList) {
			resultList.add(this.map(element,destinationClass));
		}

		return resultList;
	}

}
