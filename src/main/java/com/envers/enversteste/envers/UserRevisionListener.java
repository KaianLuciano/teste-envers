package com.envers.enversteste.envers;

import com.envers.enversteste.service.UserService;
import org.hibernate.envers.RevisionListener;

public class UserRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        AuditEnversInfo customRevisionEntity = (AuditEnversInfo) revisionEntity;
        customRevisionEntity.setUsername(UserService.getCurre);

     }
}
