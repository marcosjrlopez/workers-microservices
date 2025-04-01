package com.devsuperior.hr_worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hr_worker.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
