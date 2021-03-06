/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
 
package io.swagger.api.client.model

import io.swagger.swagger.runtime.annotations._

import scala.reflect.BeanProperty

import scala.collection.JavaConversions._

import scala.collection.mutable.ListBuffer


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author tony
 *
 */
class Sentence extends Object {

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var id:Long =_

	/**
	 * 
	 * 
	 * 
	 */
	var scoredWords  =  new ListBuffer[ScoredWord]
	def getScoredWords:java.util.List[io.swagger.api.client.model.ScoredWord] = {
	    scoredWords.toList
	}
	def setScoredWords(args:java.util.List[io.swagger.api.client.model.ScoredWord]) = {
	    scoredWords.clear
	    args.foreach(arg=>scoredWords += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var display:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var rating:Integer =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var documentMetadataId:Long =_

    override def toString:String = {
        "[" +
        "id:" + id + 
            "scoredWords:" + scoredWords + 
            "display:" + display + 
            "rating:" + rating + 
            "documentMetadataId:" + documentMetadataId + "]"
    }
}