package com.envers.enversteste.envers;

import org.hibernate.envers.RevisionListener;

public class UserRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        AuditEnversInfo customRevisionEntity = (AuditEnversInfo) revisionEntity;
        customRevisionEntity.setUsername("Nome padrao");

     }
}
