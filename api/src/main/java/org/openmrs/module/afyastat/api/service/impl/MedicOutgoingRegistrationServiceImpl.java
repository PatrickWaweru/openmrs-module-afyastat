/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.afyastat.api.service.impl;

import java.util.Date;
import java.util.List;

import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.afyastat.api.db.MedicOutgoingRegistrationDao;
import org.openmrs.module.afyastat.api.service.MedicOutgoingRegistrationService;
import org.openmrs.module.afyastat.model.MedicOutgoingRegistration;

public class MedicOutgoingRegistrationServiceImpl extends BaseOpenmrsService implements MedicOutgoingRegistrationService {
	
	MedicOutgoingRegistrationDao dao;
	
	UserService userService;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(MedicOutgoingRegistrationDao dao) {
		this.dao = dao;
	}
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * Returns an item by uuid. It can be called by any authenticated user. It is fetched in read
	 * only transaction.
	 * 
	 * @param uuid
	 * @return
	 * @throws APIException
	 */
	@Override
	public MedicOutgoingRegistration getRecordByUuid(String uuid) throws APIException {
		return dao.getRecordByUuid(uuid);
	}
	
	/**
	 * Saves an item. Sets the owner to superuser, if it is not set. It can be called by users with
	 * this module's privilege. It is executed in a transaction.
	 * 
	 * @param record
	 * @return
	 * @throws APIException
	 */
	@Override
	public MedicOutgoingRegistration saveRecord(MedicOutgoingRegistration record) throws APIException {
		return dao.saveRecord(record);
	}
	
	/**
	 * Gets a list of departments.
	 * 
	 * @return the department list.
	 */
	@Override
	public List<MedicOutgoingRegistration> getAllRecords() {
		return dao.getAllRecords();
	}
	
	/**
	 * Gets a department for a given id.
	 * 
	 * @param id the department id
	 * @return the department with the given id
	 */
	@Override
	public MedicOutgoingRegistration getRecordById(Integer id) {
		return dao.getRecord(id);
	}
	
	/**
	 * Deletes a department from the database.
	 * 
	 * @param record the record to delete.
	 */
	@Override
	public void purgeRecord(MedicOutgoingRegistration record) {
		dao.purgeRecord(record);
	}
	
	/**
	 * Voids a record given an id.
	 * 
	 * @param id the record id
	 */
	@Override
	public void voidRecord(Integer id) {
		dao.voidRecord(id);
	}
	
	/**
	 * Gets records with a given status.
	 * 
	 * @param status the record status
	 * @return all records with the given status
	 */
	@Override
	public List<MedicOutgoingRegistration> getRecordsByStatus(Integer status) {
		return (dao.getRecordsByStatus(status));
	}
	
	/**
	 * Gets records for a given purpose.
	 * 
	 * @param purpose the record purpose
	 * @return all records with the given purpose
	 */
	@Override
	public List<MedicOutgoingRegistration> getRecordsByPurpose(String purpose) {
		return (dao.getRecordsByPurpose(purpose));
	}
	
	/**
	 * Gets records for within a given date range
	 * 
	 * @param startDate the range start date
	 * @param endDate the range end date
	 * @return all records within the given date range
	 */
	@Override
	public List<MedicOutgoingRegistration> getRecordsByDate(Date startDate, Date endDate) {
		return (dao.getRecordsByDate(startDate, endDate));
	}
	
	/**
	 * Sets the status of a record
	 * 
	 * @param id the record id
	 * @param status the record status
	 */
	@Override
	public void recordSetStatus(Integer id, Integer status) {
		dao.recordSetStatus(id, status);
	}
}
