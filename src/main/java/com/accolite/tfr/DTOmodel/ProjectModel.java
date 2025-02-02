package com.accolite.tfr.DTOmodel;

import com.accolite.tfr.model.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class ProjectModel {

    private int id;
    private String name;
    private LocalDate start_date;
    private LocalDate end_date;
    private  String rag_status;
    private int sow;
    private int total_resource;
    private Organisation department;
    private Organisation superDepartment;
    private Organisation division;
    private String remarks;
    private int parent_id;
    private  int current_pointer;
    private Date date_of_add;
    private Resource createdBy;
    private String invoicing_status;
    private Resource spoc;
    private Resource depHead;
    private Resource projectLead;
    private Clients client;
    private List<Milestone> milestoneList;
    private List<ResourceHistory> ResourceHistoryProject;
    private List<Risk> ProjectRisk;
    private List<ProjectStatus> listOfStatus;
    private Set<Resource> resource = new HashSet<>();

}
