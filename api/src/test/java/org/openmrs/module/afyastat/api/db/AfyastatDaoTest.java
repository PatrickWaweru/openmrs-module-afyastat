/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.afyastat.api.db;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.Matchers.is;
import org.openmrs.module.afyastat.api.service.MedicQueData;

/**
 * It is an integration test (extends BaseModuleContextSensitiveTest), which verifies DAO methods
 * against the in-memory H2 database. The database is initially loaded with data from
 * standardTestDataset.xml in openmrs-api. All test methods are executed in transactions, which are
 * rolled back by the end of each test method.
 */
@ContextConfiguration({ "classpath*:TestingApplicationContext.xml" })
public class AfyastatDaoTest extends BaseModuleContextSensitiveTest {
	
	// @Autowired
	// private MedicQueData medicQueData;
	
	@Test
	@Ignore("Unignore if you want to make the Item class persistable, see also Item and liquibase.xml")
	public void daoTest() {
		//run test
		Assert.assertThat(true, is(true));
	}
}
