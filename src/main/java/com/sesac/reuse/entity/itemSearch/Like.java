package com.sesac.reuse.entity.itemSearch;

import lombok.Getter;
import lombok.Setter;
import com.sesac.reuse.entity.member.Member;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "like")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bmId")
    private Long bmId;

    @ManyToOne(fetch = FetchType.LAZY) // JPA 즉시 로딩
    @JoinColumn(name = "member_id")
    private Member memberId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId")
    private Item itemId;

    public static Like toLike(Member memberId, Item itemId){
        Like likeEntity = new Like();
        likeEntity.setMemberId(memberId);
        likeEntity.setItemId(itemId);

        return likeEntity;
    }
}
