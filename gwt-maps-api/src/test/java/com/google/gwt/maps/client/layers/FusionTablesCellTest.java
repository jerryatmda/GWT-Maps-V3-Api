package com.google.gwt.maps.client.layers;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class FusionTablesCellTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testColumnName() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesCell o = FusionTablesCell.newInstance();
				String left = "test";
				o.setColumnName(left);
				String right = o.getColumnName();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesCell o = FusionTablesCell.newInstance();
				finishTest();
			}
		});

	}

	public void testValue() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesCell o = FusionTablesCell.newInstance();
				String left = "test";
				o.setValue(left);
				String right = o.getValue();
				assertEquals(left, right);
				finishTest();
			}
		});

	}
}
