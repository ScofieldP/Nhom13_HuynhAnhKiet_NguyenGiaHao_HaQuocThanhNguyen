package com.example.nhom13_huynhanhkiet_nguyengiahao_haquocthanhnguyen.database;

import java.util.List;
import java.util.concurrent.Executor;

import io.reactivex.Flowable;

public class CallDetailRepository {

    private CallDetailDAO callDetailDAO;
    private Executor executor;

    public CallDetailRepository(CallDetailDAO callDetailDAO, Executor exec) {
        this.callDetailDAO = callDetailDAO;
        executor = exec;
    }

    public Flowable<List<CallDetailEntity>> getAll() {
        return callDetailDAO.getAll();
    }

    public void insert(CallDetailEntity callDetailEntity) {
        executor.execute(() -> callDetailDAO.insert(callDetailEntity));
    }

    public void update(CallDetailEntity callDetailEntity) {
        executor.execute(() -> callDetailDAO.update(callDetailEntity));
    }

    public void delete(CallDetailEntity callDetailEntity) {
        executor.execute(() -> callDetailDAO.delete(callDetailEntity));
    }
}
