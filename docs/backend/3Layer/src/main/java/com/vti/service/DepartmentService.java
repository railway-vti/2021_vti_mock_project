package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Department;
import com.vti.filter.FilterDepartment;
import com.vti.repository.IDepartmentRepository;
import com.vti.utils.Paging;
import com.vti.utils.Sorting;

@Service
public class DepartmentService implements IDepartmentService {

	@Autowired
	private IDepartmentRepository repository;

	public List<Department> getAllDepartments(Paging paging, Sorting sorting, FilterDepartment filter, String search) {
		return repository.getAllDepartments(paging, sorting, filter, search);
	}

	public Department getDepartmentByID(short id) {
		return repository.getDepartmentByID(id);
	}

	public Department getDepartmentByName(String name) {
		return repository.getDepartmentByName(name);
	}

	public void createDepartment(Department department) {
		repository.createDepartment(department);
	}

	public void updateDepartment(short id, String newName) {
		repository.updateDepartment(id, newName);
	}

	public void updateDepartment(Department department) {
		repository.updateDepartment(department);
	}

	public void deleteDepartment(short id) {
		repository.deleteDepartment(id);
	}

	public boolean isDepartmentExistsByID(short id) {
		return repository.isDepartmentExistsByID(id);
	}

	public boolean isDepartmentExistsByName(String name) {
		return repository.isDepartmentExistsByName(name);
	}
}
