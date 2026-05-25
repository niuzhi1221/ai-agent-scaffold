package cn.bugstack.ai.api.dto;

import lombok.Data;

/**
 * 智能体配置相应对象
 */
@Data
public class AiAgentConfigResponseDTO {
    /**
     * 智能体Id
     */
    private String agentId;

    /**
     * 智能体名称
     */
    private String agentName;

    /**
     * 智能体描述
     */
    private String agentDesc;
}
