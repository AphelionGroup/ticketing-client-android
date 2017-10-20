package com.chandigarhadmin.models;


import java.io.Serializable;
import java.util.List;


public class ChatPojoModel implements Serializable{
    private List<BranchesModel> departmentModelResponse;
    private List<GetTicketResponse> getTicketResponse;
    private CreateTicketResponse createTicketResponse;
    private boolean alignRight;
    private String type;
    private String input;

    public CreateTicketResponse getCreateTicketResponse() {
        return createTicketResponse;
    }

    public void setCreateTicketResponse(CreateTicketResponse createTicketResponse) {
        this.createTicketResponse = createTicketResponse;
    }

    public boolean isAlignRight() {
        return alignRight;
    }

    public void setAlignRight(boolean alignRight) {
        this.alignRight = alignRight;
    }

    public List<BranchesModel> getDepartmentResponse() {
        return departmentModelResponse;
    }

    public void setDepartmentResponse(List<BranchesModel> departmentModelResponse) {
        this.departmentModelResponse = departmentModelResponse;
    }

    public List<GetTicketResponse> getGetTicketResponse() {
        return getTicketResponse;
    }

    public void setGetTicketResponse(List<GetTicketResponse> getTicketResponse) {
        this.getTicketResponse = getTicketResponse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
