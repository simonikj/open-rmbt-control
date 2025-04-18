package at.rtr.rmbt.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class UrlsResponse {

    @JsonProperty(value = "url_share")
    private final String urlShare;

    @JsonProperty(value = "url_ipv6_check")
    private final String urlIPV6Check;

    @JsonProperty(value = "control_ipv4_only")
    private final String controlIPV4Only;

    @JsonProperty(value = "open_data_prefix")
    private final String openDataPrefix;

    @JsonProperty(value = "url_map_server")
    private final String urlMapServer;

    @JsonProperty(value = "url_ipv4_check")
    private final String urlIPV4Check;

    @JsonProperty(value = "control_ipv6_only")
    private final String controlIPV6Only;

    @JsonProperty(value = "statistics")
    private final String statistics;

    @JsonProperty(value = "url_statistic_server")
    private final String urlStatisticServer;

    @JsonProperty(value = "url_web_statistic_server")
    private final String urlWebStatisticServer;

    @JsonProperty(value = "url_web_open_data_server")
    private final String urlWebOpenDataServer;

    @JsonProperty(value = "url_web_recent_server")
    private final String urlWebRecentServer;

    @JsonProperty(value = "url_web_basemap_tiles")
    private final String urlWebBasemapServer;

    @JsonProperty(value = "url_web_osm_tiles")
    private final String urlWebOSMServer;
}
