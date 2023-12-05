package com.springprofissional.desafiocrud.dto;

import com.springprofissional.desafiocrud.dto.CustomError;
import com.springprofissional.desafiocrud.dto.FieldMessege;

import java.sql.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

    private List<FieldMessege> errors = new ArrayList<>();

    public ValidationError(List<FieldMessege> errors) {
        this.errors = errors;
    }

    public ValidationError(Instant timestap, Integer status, String error, String path) {
        super(timestap, status, error, path);
    }

    public List<FieldMessege> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String messege){
        errors.add(new FieldMessege(fieldName,messege));
    }
}
