# Usage: generate-go.cmd  <servicename> 
SVC_PATH=../go/$1
mkdir -p $SVC_PATH/internal/model
protoc $SVC_PATH/*.proto --go_out=plugins=grpc:$SVC_PATH/internal/model/ --proto_path=$SVC_PATH:.
protoc ./*.proto --go_out=plugins=grpc:$SVC_PATH/internal/model/ --proto_path=$SVC_PATH:.