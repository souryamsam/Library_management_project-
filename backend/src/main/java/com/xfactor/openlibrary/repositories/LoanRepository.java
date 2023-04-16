package com.xfactor.openlibrary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xfactor.openlibrary.domain.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long>{
    List<Loan> findByCheckoutDate(String checkoutDate);
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
