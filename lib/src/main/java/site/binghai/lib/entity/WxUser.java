package site.binghai.lib.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class WxUser extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String avatar;
    private String userName;
    private String phone;
    private String openId;
    private Long refereeId; //推荐人id
}
