/**
 * There are <a href="https://github.com/ketayao/keta-custom">keta-custom</a> code generation
 */
package com.innshine.coststype.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.innshine.coststype.entity.FinanceCostsType;

public interface FinanceCostsTypeDAO extends JpaRepository<FinanceCostsType, Long>, JpaSpecificationExecutor<FinanceCostsType> {

}