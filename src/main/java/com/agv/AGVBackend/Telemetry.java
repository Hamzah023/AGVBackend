package com.agv.AGVBackend;

import jakarta.persistence.*;
import java.time.LocalDateTime;

public class Telemetry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agvId;
    private int x;
    private int y;
    private String status;

    private LocalDateTime timestamp = LocalDateTime.now();

    public Telemetry() {}

    //Getters and Setters
    public Long getId() { return id; }

    public String getAgvId() { return agvId; }
    public void setAgvId(String agvId) { this.agvId = agvId; }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

}
