package com.mockproject.javaGroup3.controller;

import com.mockproject.javaGroup3.exception.NotFoundException;
import com.mockproject.javaGroup3.model.LeaseContract;
import com.mockproject.javaGroup3.repository.LeaseContractRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/leasecontract")
public class LeaseContractController {

    private final LeaseContractRepository leaseContractRepository;

    @GetMapping("")
    public List<LeaseContract> getLeaseContracts() {
        return leaseContractRepository.findAll();
    }

    @GetMapping("{id}")
    public LeaseContract getLeaseContractById(@PathVariable int id) {
        return leaseContractRepository.findById(id).orElseThrow(() -> new NotFoundException(LeaseContract.class.getName(), id));
    }

    @PostMapping
    public LeaseContract addLeaseContract(@RequestBody LeaseContract leaseContract) {
        return leaseContractRepository.save(leaseContract);
    }

    @PutMapping("{id}")
    public LeaseContract updateLeaseContract(@PathVariable int id, @RequestBody LeaseContract newLeaseContract) {
        LeaseContract leaseContract = getLeaseContractById(id);
        BeanUtils.copyProperties(newLeaseContract, leaseContract, "id");
        return leaseContractRepository.save(leaseContract);
    }

    @DeleteMapping("{id}")
    public void deleteLeaseContract(@PathVariable int id) {
        LeaseContract leaseContract = getLeaseContractById(id);
        leaseContractRepository.delete(leaseContract);
    }


}
