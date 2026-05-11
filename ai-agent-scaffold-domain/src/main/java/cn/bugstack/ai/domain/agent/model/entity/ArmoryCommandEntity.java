package cn.bugstack.ai.domain.agent.model.entity;

import cn.bugstack.ai.domain.agent.model.valobj.AiAgentConfigTableVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 命令实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArmoryCommandEntity {

    private AiAgentConfigTableVO aiAgentConfigTableVO;
}
